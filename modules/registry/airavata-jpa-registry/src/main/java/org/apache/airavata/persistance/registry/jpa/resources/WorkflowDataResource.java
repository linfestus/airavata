package org.apache.airavata.persistance.registry.jpa.resources;

import org.apache.airavata.persistance.registry.jpa.Resource;
import org.apache.airavata.persistance.registry.jpa.ResourceType;
import org.apache.airavata.persistance.registry.jpa.ResourceUtils;
import org.apache.airavata.persistance.registry.jpa.model.Experiment_Data;
import org.apache.airavata.persistance.registry.jpa.model.Gram_Data;
import org.apache.airavata.persistance.registry.jpa.model.Node_Data;
import org.apache.airavata.persistance.registry.jpa.model.Workflow_Data;
import org.apache.airavata.persistance.registry.jpa.utils.QueryGenerator;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class WorkflowDataResource extends AbstractResource{
    public static final String NODE_DATA = "Node_Data";
    public static final String GRAM_DATA = "Gram_Data";
    private String experimentID;
    private String workflowInstanceID;
    private String templateName;
    private String status;
    private Timestamp startTime;
    private Timestamp lastUpdatedTime;

    public String getExperimentID() {
        return experimentID;
    }

    public String getWorkflowInstanceID() {
        return workflowInstanceID;
    }

    public String getTemplateName() {
        return templateName;
    }

    public String getStatus() {
        return status;
    }

    public void setExperimentID(String experimentID) {
        this.experimentID = experimentID;
    }

    public void setWorkflowInstanceID(String workflowInstanceID) {
        this.workflowInstanceID = workflowInstanceID;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public Timestamp getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public void setLastUpdatedTime(Timestamp lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public Resource create(ResourceType type) {
       switch (type){
           case NODE_DATA:
               NodeDataResource nodeDataResource = new NodeDataResource();
               nodeDataResource.setWorkflowDataResource(this);
               return nodeDataResource;
           case GRAM_DATA:
               GramDataResource gramDataResource = new GramDataResource();
               gramDataResource.setWorkflowDataResource(this);
               return gramDataResource;
           default:
               throw new IllegalArgumentException("Unsupported resource type for workflow data resource.");
       }
    }

    public void remove(ResourceType type, Object name) {
        EntityManager em = ResourceUtils.getEntityManager();
        em.getTransaction().begin();
        Query q;
        QueryGenerator generator;
        switch (type){
            case NODE_DATA:
                generator = new QueryGenerator(NODE_DATA);
                generator.setParameter(NodeDataConstants.WORKFLOW_INSTANCE_ID, workflowInstanceID);
                generator.setParameter(NodeDataConstants.NODE_ID, name);
                q = generator.deleteQuery(em);
                q.executeUpdate();
                break;
            case GRAM_DATA:
                generator = new QueryGenerator(GRAM_DATA);
                generator.setParameter(GramDataConstants.WORKFLOW_INSTANCE_ID, workflowInstanceID);
                generator.setParameter(GramDataConstants.NODE_ID, name);
                q = generator.deleteQuery(em);
                q.executeUpdate();
                break;
            default:
                break;
        }
        em.getTransaction().commit();
        em.close();
    }

    public Resource get(ResourceType type, Object name) {
        EntityManager em = ResourceUtils.getEntityManager();
        em.getTransaction().begin();
        QueryGenerator generator;
        Query q;
        switch (type) {
            case NODE_DATA:
                generator = new QueryGenerator(NODE_DATA);
                generator.setParameter(NodeDataConstants.WORKFLOW_INSTANCE_ID, workflowInstanceID);
                generator.setParameter(NodeDataConstants.NODE_ID, name);
                q = generator.selectQuery(em);
                Node_Data enodeDeata = (Node_Data)q.getSingleResult();
                NodeDataResource nodeDataResource = (NodeDataResource)Utils.getResource(ResourceType.NODE_DATA, enodeDeata);
                em.getTransaction().commit();
                em.close();
                return nodeDataResource;
            case GRAM_DATA:
                generator = new QueryGenerator(GRAM_DATA);
                generator.setParameter(GramDataConstants.WORKFLOW_INSTANCE_ID, workflowInstanceID);
                generator.setParameter(GramDataConstants.NODE_ID, name);
                q = generator.selectQuery(em);
                Gram_Data egramData = (Gram_Data)q.getSingleResult();
                GramDataResource gramDataResource = (GramDataResource)Utils.getResource(ResourceType.GRAM_DATA, egramData);
                em.getTransaction().commit();
                em.close();
                return gramDataResource;
            default:
                em.getTransaction().commit();
                em.close();
                throw new IllegalArgumentException("Unsupported resource type for workflow data resource.");


        }
    }

    public List<Resource> get(ResourceType type) {
        List<Resource> resourceList = new ArrayList<Resource>();
        EntityManager em = ResourceUtils.getEntityManager();
        em.getTransaction().begin();
        Query q;
        QueryGenerator generator;
        List<?> results;
        switch (type){
            case NODE_DATA:
                generator = new QueryGenerator(NODE_DATA);
                generator.setParameter(NodeDataConstants.WORKFLOW_INSTANCE_ID, workflowInstanceID);
                q = generator.selectQuery(em);
                results = q.getResultList();
                if (results.size() != 0) {
                    for (Object result : results) {
                        Node_Data nodeData = (Node_Data)result;
                        NodeDataResource nodeDataResource = (NodeDataResource)Utils.getResource(ResourceType.NODE_DATA,nodeData);
                        resourceList.add(nodeDataResource);

                    }
                }
                break;
            case GRAM_DATA:
                generator = new QueryGenerator(GRAM_DATA);
                generator.setParameter(GramDataConstants.WORKFLOW_INSTANCE_ID, workflowInstanceID);
                q = generator.selectQuery(em);
                results = q.getResultList();
                if (results.size() != 0) {
                    for (Object result : results) {
                        Gram_Data gramData = (Gram_Data)result;
                        GramDataResource gramDataResource = (GramDataResource)Utils.getResource(ResourceType.GRAM_DATA, gramData);
                        resourceList.add(gramDataResource);
                    }
                }
                break;
            default:
                em.getTransaction().commit();
                em.close();
                throw new IllegalArgumentException("Unsupported resource type for workflow data resource.");
        }
        em.getTransaction().commit();
        em.close();
        return resourceList;
    }

    public void save() {
        if(lastUpdatedTime == null){
            java.util.Date date= new java.util.Date();
            lastUpdatedTime = new Timestamp(date.getTime());
        }
        EntityManager em = ResourceUtils.getEntityManager();
        Workflow_Data existingWFData = em.find(Workflow_Data.class, workflowInstanceID);
        em.close();

        em = ResourceUtils.getEntityManager();
        em.getTransaction().begin();
        Workflow_Data workflowData = new Workflow_Data();
        Experiment_Data expData = em.find(Experiment_Data.class, experimentID);
        workflowData.setExperiment_data(expData);
        workflowData.setWorkflow_instanceID(workflowInstanceID);
        workflowData.setLast_update_time(lastUpdatedTime);
        workflowData.setStart_time(startTime);
        workflowData.setTemplate_name(templateName);
        workflowData.setStatus(status);
        if(existingWFData != null){
            existingWFData.setExperiment_data(expData);
            existingWFData.setLast_update_time(lastUpdatedTime);
            existingWFData.setStart_time(startTime);
            existingWFData.setStatus(status);
            existingWFData.setTemplate_name(templateName);
            workflowData = em.merge(existingWFData);
        }else {
            em.persist(workflowData);
        }
        em.getTransaction().commit();
        em.close();
    }
    
    public boolean isNodeExists(String nodeId){
    	return isExists(ResourceType.NODE_DATA, nodeId);
    }
    
    public boolean isGramDataExists(String nodeId){
    	return isExists(ResourceType.GRAM_DATA, nodeId);
    }
    
    public NodeDataResource getNodeData(String nodeId){
    	return (NodeDataResource) get(ResourceType.NODE_DATA,nodeId);
    }
    
    public GramDataResource getGramData(String nodeId){
    	return (GramDataResource) get(ResourceType.GRAM_DATA,nodeId);
    }
    
    public List<NodeDataResource> getNodeData(){
    	return getResourceList(get(ResourceType.NODE_DATA),NodeDataResource.class);
    }
    
    public List<GramDataResource> getGramData(){
    	return getResourceList(get(ResourceType.GRAM_DATA),GramDataResource.class);
    }

    public NodeDataResource createNodeData(String nodeId){
    	NodeDataResource data=(NodeDataResource)create(ResourceType.NODE_DATA);
    	data.setNodeID(nodeId);
    	return data;
    }
    
    public GramDataResource createGramData(String nodeId){
    	GramDataResource data=(GramDataResource)create(ResourceType.GRAM_DATA);
    	data.setNodeID(nodeId);
    	return data;
    }
    
    public void removeNodeData(String nodeId){
    	remove(ResourceType.NODE_DATA, nodeId);
    }
    
    public void removeGramData(String nodeId){
    	remove(ResourceType.GRAM_DATA, nodeId);
    }
    
}
