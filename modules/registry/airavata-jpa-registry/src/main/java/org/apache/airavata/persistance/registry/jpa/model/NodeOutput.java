/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.apache.airavata.persistance.registry.jpa.model;

import org.apache.openjpa.persistence.DataCache;

import javax.persistence.*;
import java.io.Serializable;

@DataCache
@Entity
@Table(name = "NODE_OUTPUT")
@IdClass(NodeOutput_PK.class)
public class NodeOutput implements Serializable {
    @Id
    @Column(name = "NODE_INSTANCE_ID")
    private String nodeId;
    @Id
    @Column(name = "OUTPUT_KEY")
    private String outputKey;
    @Column(name = "DATA_TYPE")
    private String dataType;
    @Column(name = "VALUE")
    private String value;
    @Column(name = "IS_REQUIRED")
    private boolean isRequired;
    @Column(name="REQUIRED_TO_COMMANDLINE")
    private boolean requiredToCMD;
    @Column(name = "DATA_MOVEMENT")
    private boolean dataMovement;
    @Column(name = "DATA_NAME_LOCATION")
    private String dataNameLocation;
    @Column(name = "SEARCH_QUERY")
    private String searchQuery;
    @Column(name = "APP_ARGUMENT")
    private String applicationArgument;

    @ManyToOne(cascade= CascadeType.MERGE)
    @JoinColumn(name = "NODE_INSTANCE_ID")
    private WorkflowNodeDetail nodeDetail;

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getOutputKey() {
        return outputKey;
    }

    public void setOutputKey(String outputKey) {
        this.outputKey = outputKey;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean isRequired) {
        this.isRequired = isRequired;
    }

    public boolean isRequiredToCMD() {
        return requiredToCMD;
    }

    public void setRequiredToCMD(boolean requiredToCMD) {
        this.requiredToCMD = requiredToCMD;
    }

    public boolean isDataMovement() {
        return dataMovement;
    }

    public void setDataMovement(boolean dataMovement) {
        this.dataMovement = dataMovement;
    }

    public String getDataNameLocation() {
        return dataNameLocation;
    }

    public void setDataNameLocation(String dataNameLocation) {
        this.dataNameLocation = dataNameLocation;
    }

    public String getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
    }

    public String getApplicationArgument() {
        return applicationArgument;
    }

    public void setApplicationArgument(String applicationArgument) {
        this.applicationArgument = applicationArgument;
    }
}
