package com.company;

public class Service {
    private Service (){}
    private static Service service=new Service();
    public static Service getInstance(){return service; }
    public void save(Entity entity)throws Exception{
        try(Repository repository=new Repository()){
            repository.insert(entity);
            repository.commit();
        }
    }
public void edit(Entity entity)throws Exception{
        try(Repository repository=new Repository()){
            repository.edit(entity);
            repository.commit();
        }
}
public void remove(int id)throws Exception{
        try(Repository repository=new Repository()){
            repository.delete(id);
            repository.commit();
        }
}
}
