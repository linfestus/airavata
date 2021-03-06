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

package org.apache.airavata.registry.core.experiment.catalog.impl;

import org.apache.airavata.common.exception.ApplicationSettingsException;
import org.apache.airavata.common.utils.ServerSettings;
import org.apache.airavata.model.workspace.Gateway;
import org.apache.airavata.registry.core.experiment.catalog.ExpCatResourceUtils;
import org.apache.airavata.registry.core.experiment.catalog.ExperimentCatResource;
import org.apache.airavata.registry.core.experiment.catalog.resources.GatewayResource;
import org.apache.airavata.registry.core.experiment.catalog.utils.ThriftDataModelConversion;
import org.apache.airavata.registry.cpi.RegistryException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class GatewayRegistry {

    private final static Logger logger = LoggerFactory.getLogger(GatewayRegistry.class);
    public GatewayResource getDefaultGateway () throws ApplicationSettingsException, RegistryException {
        return (GatewayResource) ExpCatResourceUtils.getGateway(ServerSettings.getDefaultUserGateway());
    }

    public GatewayResource getExistingGateway (String gatewayName) throws RegistryException {
        return (GatewayResource) ExpCatResourceUtils.getGateway(gatewayName);
    }

    public String addGateway (Gateway gateway) throws RegistryException{
        try {
            GatewayResource resource = (GatewayResource) ExpCatResourceUtils.createGateway(gateway.getGatewayId());
            resource.setGatewayName(gateway.getGatewayName());
            resource.setEmailAddress(gateway.getEmailAddress());
            resource.setDomain(gateway.getDomain());
            resource.save();
            return gateway.getGatewayId();
        }catch (RegistryException e){
            logger.error("Error while saving gateway to registry", e);
            throw new RegistryException(e);
        }
    }

    public void updateGateway (String gatewayId, Gateway updatedGateway) throws RegistryException{
        try {
            GatewayResource existingGateway = (GatewayResource) ExpCatResourceUtils.getGateway(gatewayId);
            existingGateway.setGatewayName(updatedGateway.getGatewayName());
            existingGateway.setEmailAddress(updatedGateway.getEmailAddress());
            existingGateway.setDomain(updatedGateway.getDomain());
            existingGateway.save();
        }catch (RegistryException e){
            logger.error("Error while updating gateway to registry", e);
            throw new RegistryException(e);
        }
    }

    public Gateway getGateway (String gatewayId) throws RegistryException{
        try {
            GatewayResource resource = (GatewayResource) ExpCatResourceUtils.getGateway(gatewayId);
            return ThriftDataModelConversion.getGateway(resource);
        }catch (RegistryException e){
            logger.error("Error while getting gateway", e);
            throw new RegistryException(e);
        }
    }

    public boolean isGatewayExist (String gatewayId) throws RegistryException{
        try {
            return ExpCatResourceUtils.isGatewayExist(gatewayId);
        }catch (RegistryException e){
            logger.error("Error while checking gateway exists", e);
            throw new RegistryException(e);
        }
    }

    public boolean removeGateway (String gatewayId) throws RegistryException{
        try {
            return ExpCatResourceUtils.removeGateway(gatewayId);
        }catch (Exception e){
            logger.error("Error while removing the gateway", e);
            throw new RegistryException(e);
        }
    }

    public List<Gateway> getAllGateways () throws RegistryException {
        List<Gateway> gatewayList = new ArrayList<Gateway>();
        try {
            List<ExperimentCatResource> allGateways = ExpCatResourceUtils.getAllGateways();
            return ThriftDataModelConversion.getAllGateways(allGateways);
        }catch (Exception e){
            logger.error("Error while getting all the gateways", e);
            throw new RegistryException(e);
        }
    }

}
