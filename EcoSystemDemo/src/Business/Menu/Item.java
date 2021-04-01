/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

/**
 *
 * @author acer
 */
public class Item {
    private String name;
    int id;
    static int count = 100;
    public Item(String name) {
        this.name = name;
        this.id = count++;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
        return Integer.toString(id);
    }
    
    
    
}
