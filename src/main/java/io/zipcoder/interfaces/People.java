package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People<E extends Person> {
    protected ArrayList<E> personList;

    public People(ArrayList<E> personList) {
        this.personList = personList;
    }

    public People() {
        this(new ArrayList<E>());
    }

    public void add(E person){
        personList.add(person);
    }

    public Person findById(long id){
        for (E person : personList){
            if(person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public void remove(E person){
        personList.remove(person);
    }

    public void remove(long id){
        for(E person : personList){
            if(person.getId() == id){
                personList.remove(person);
                break;
            }
        }
    }

    public Integer getCount(){
        return personList.size();
    }

    public Person[] getArray(){
        Person[] result = new Person[personList.size()];
        for (int i = 0; i < result.length; i++){
            result[i] = personList.get(i);
        }
        return result;
    }

    public void removeAll(){
        personList.clear();
    }
}
