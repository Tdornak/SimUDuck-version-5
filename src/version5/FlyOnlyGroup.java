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
public interface FlyOnlyGroup extends Duck {
    public abstract void performFly();
    public abstract void setFlyStrategy(FlyStrategy fs);
    public abstract FlyStrategy getFlyStrategy();
}
