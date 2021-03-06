package cn.mobilemd;

import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by jerry on 2017/4/2.
 */
public class hitest {

    @Test
    public void testHi(){
        Client client = ClientBuilder.newClient();
        WebTarget webTarget  = client.target("http://localhost:18080/hi");
        List list = webTarget.request(MediaType.APPLICATION_JSON_TYPE).get(List.class);
        Assert.assertNotNull( list );
        Assert.assertEquals("hello spring boot", list.get(0));
    }
}
