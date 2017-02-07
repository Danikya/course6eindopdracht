/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overlapviewer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Tim
 */
public class Statistics {
    ArrayList<Gene> geneList = new ArrayList<>();
    Set<Integer> gene1 = new HashSet<>();
    Set<Integer> gene2 = new HashSet<>();
    Set<String> Interaction = new HashSet<>();
    
    Statistics(ArrayList<Gene> geneList){
        this.geneList = geneList;
    }
    
    public int tax1Length(){
        for(Gene ob : geneList){
            gene1.add(ob.getGeneID1());
        }
        return gene1.size();
    }
    
    public int tax2Length(){
        for(Gene ob : geneList){
            gene2.add(ob.getGeneID2());
        }
        return gene2.size();
    }
    
    public int countInteractions(){
        for(Gene ob : geneList){
            Interaction.add(ob.getInteraction());
        }
        return Interaction.size();
    }
    
    public int geneSize(){
        return geneList.size();
    }
//start of getters
  
    public Set<Integer> getTax1() {
        return gene1;
    }

    public Set<Integer> getTax2() {
        return gene2;
    }

    public Set<String> getInteraction() {
        return Interaction;
    }
    
//start of setters
 
    public void setTax1(Set<Integer> Tax1) {
        this.gene1 = Tax1;
    }

    public void setTax2(Set<Integer> Tax2) {
        this.gene2 = Tax2;
    }

    public void setInteraction(Set<String> Interaction) {
        this.Interaction = Interaction;
    }
    
}