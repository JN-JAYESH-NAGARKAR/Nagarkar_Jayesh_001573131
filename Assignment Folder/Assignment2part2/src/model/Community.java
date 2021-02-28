/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class Community {
    String communityName;
    ArrayList<Home> homeList;
    
    public Community(){
        homeList = new ArrayList<Home>();
    }

    public ArrayList<Home> getHomeList() {
        return homeList;
    }

    public void setHomeList(ArrayList<Home> homeList) {
        this.homeList = homeList;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
    
    
    
    public Home addHome(){
        Home home = new Home();
        homeList.add(home);
        return home;
    }

}
