package crudExample.service;

import crudExample.models.Founder;

public interface FounderService {

    Founder[] creatFounder(Founder founder);

    Founder[] getAllFounder();

    public Founder getByIdFounder(long id);

    void updateFounderById(long id, Founder newFounder);

   void deleteFounderById(long id);
}
