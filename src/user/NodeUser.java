/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import market.*;

/**
 *
 * @author muchsin
 */
public class NodeUser {
    NodeUser prev;
    NodeUser next;
    private User user;

    public NodeUser getPrev() {
        return prev;
    }

    public void setPrev(NodeUser prev) {
        this.prev = prev;
    }

    public NodeUser getNext() {
        return next;
    }

    public void setNext(NodeUser next) {
        this.next = next;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
}