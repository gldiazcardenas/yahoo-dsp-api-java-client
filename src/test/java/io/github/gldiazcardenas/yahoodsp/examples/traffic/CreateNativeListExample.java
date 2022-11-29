package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.NativeList;
import io.github.gldiazcardenas.yahoodsp.client.model.NativeListItem;
import io.github.gldiazcardenas.yahoodsp.client.model.NativeListResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

import java.util.ArrayList;

/**
 * @author Gabriel Diaz, Nov 29th 2022.
 */
public class CreateNativeListExample implements Example {

    public static void main(String[] arg) {
        NativeList test = new NativeList();
        test.setName("gabriel-test");
        test.setAccountId(ADVERTISER_ID);
        test.setItems(new ArrayList<>());
        test.getItems().add(new NativeListItem("yamaha.com"));
        test.getItems().add(new NativeListItem("honda.com"));
        test.getItems().add(new NativeListItem("ford.com"));
        NativeListResponse response = API.getNativeListService()
                .createNativeList(AUTH, test);
        System.out.println(response);
    }

}
