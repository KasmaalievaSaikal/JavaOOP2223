package crudExample.service.impl;

import crudExample.models.Founder;
import crudExample.service.FounderService;

import java.util.Arrays;

public class FounderServiceImpl  implements FounderService {

    Founder[] founders = new Founder[6];
    int count = 0;

    public Founder[] creatFounder(Founder founder) {
        founders[count++] = founder;
        System.out.println("Success");
        return founders;
    }

    public Founder[] getAllFounder() {
        return founders;
    }

    public Founder getByIdFounder(long id) {
        for (Founder founder : founders) {
            if (founder.getId() == id) {
                return founder;
            }
        }
        return null;
    }



    public void updateFounderById(long id, Founder newFounder) {
        Founder oldFounder = getByIdFounder(id);
        oldFounder.setFullName(newFounder.getFullName());
        oldFounder.setFounderCompany(newFounder.getFounderCompany());
        System.out.println("Success");
    }

    public void deleteFounderById(long id) {
        int index = -1;

        for (int i = 0; i < founders.length; i++) {
            if (founders[i].getId() == id) {
                index = i;
                break;
            }
        }
        Founder[] newFounders = new Founder[founders.length - 1];
        for (int i = 0; i < index; i++) {
            newFounders[i] = founders[i];
        }
        for (int i = index; i < newFounders.length; i++) {
            newFounders[i] = founders[i + 1];
        }
        System.out.println(Arrays.toString(newFounders));
        founders = newFounders;
    }

}
