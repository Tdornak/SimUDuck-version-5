/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package version5;

/**
 *
 * @author tdornak
 */
public interface QuackOnlyGroup extends Duck {
    public abstract void performQuack();
    public abstract void setQuackStrategy(QuackStrategy qs);
    public abstract QuackStrategy getQuackStrategy();
}
