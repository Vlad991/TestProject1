package com.infopulse.service;

public class ServiceFactory {
    private static ClientService clientService = new ClientService();
    public static synchronized ClientService getClientService(){
        return clientService;
    }
}
