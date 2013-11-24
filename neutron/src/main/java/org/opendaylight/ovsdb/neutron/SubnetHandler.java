package org.opendaylight.ovsdb.neutron;

import java.net.HttpURLConnection;

import org.opendaylight.controller.networkconfig.neutron.INeutronSubnetAware;
import org.opendaylight.controller.networkconfig.neutron.NeutronSubnet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubnetHandler extends BaseHandler implements INeutronSubnetAware {
    static final Logger logger = LoggerFactory.getLogger(SubnetHandler.class);
    @Override
    public int canCreateSubnet(NeutronSubnet subnet) {
        return HttpURLConnection.HTTP_CREATED;
    }

    @Override
    public void neutronSubnetCreated(NeutronSubnet subnet) {
        logger.debug("Neutron Subnet Creation : {}", subnet.toString());
    }

    @Override
    public int canUpdateSubnet(NeutronSubnet delta, NeutronSubnet original) {
        return HttpURLConnection.HTTP_CREATED;
    }

    @Override
    public void neutronSubnetUpdated(NeutronSubnet subnet) {
        // TODO Auto-generated method stub

    }

    @Override
    public int canDeleteSubnet(NeutronSubnet subnet) {
        // TODO Auto-generated method stub
        return HttpURLConnection.HTTP_CREATED;
    }

    @Override
    public void neutronSubnetDeleted(NeutronSubnet subnet) {
        // TODO Auto-generated method stub

    }
}
