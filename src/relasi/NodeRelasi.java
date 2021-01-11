/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relasi;

/**
 *
 * @author muchsin
 */
public class NodeRelasi {
    NodeRelasi prev;
    NodeRelasi next;
    private Relasi relasi;

    public NodeRelasi getPrev() {
        return prev;
    }

    public void setPrev(NodeRelasi prev) {
        this.prev = prev;
    }

    public NodeRelasi getNext() {
        return next;
    }

    public void setNext(NodeRelasi next) {
        this.next = next;
    }

    public Relasi getRelasi() {
        return relasi;
    }

    public void setRelasi(Relasi relasi) {
        this.relasi = relasi;
    }
}
