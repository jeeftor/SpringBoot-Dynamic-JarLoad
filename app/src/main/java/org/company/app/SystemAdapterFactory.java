package org.company.app;

import org.company.commons.adapters.SystemAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class SystemAdapterFactory {

    @Autowired
    List<SystemAdapter> adapters;


    @PostConstruct
    void listAdapters() {
        System.out.println("\n\n-------SYSTEM ADAPTERS ------\n");
        for (SystemAdapter adapter: adapters) {
            System.out.println("...Loaded Class: " + adapter.getClass() + " of type: " + adapter.getType().toString());
        }
        System.out.println("\n-------------------------------");
    }

}
