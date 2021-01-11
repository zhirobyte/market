/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barang;

import barang.*;

/**
 *
 * @author muchsin
 */
public class NodeBarang {
    NodeBarang prev;
    NodeBarang next;
    private Barang barang;

    public NodeBarang getPrev() {
        return prev;
    }

    public void setPrev(NodeBarang prev) {
        this.prev = prev;
    }

    public NodeBarang getNext() {
        return next;
    }

    public void setNext(NodeBarang next) {
        this.next = next;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }
}
