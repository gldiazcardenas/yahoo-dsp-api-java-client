package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.DataDictionaryResource;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.DataDictionaryService;

class DataDictionaryServiceImpl implements DataDictionaryService {

    private final DataDictionaryResource resource;

    DataDictionaryServiceImpl(DataDictionaryResource resource) {
        this.resource = resource;
    }

}
