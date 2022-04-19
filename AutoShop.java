package lab7;

import java.util.*;

/**
 * A class representing a <strong> auto shop </strong> that has an <strong>
 * owner</strong> . An auto shop owns a collection (or possibly collections)
 * of vehicles.
 *
 * <p>
 * Only the owner of the auto shop is able to sell vehicles from the auto shop.
 * </p>
 *
 * <p>
 * <strong>ASSUMPTION:</strong> each vehicle in the auto shop is unique, i.e., the auto shop
 * does NOT have two vehicles that are equal to each other (see the equal() method
 * of the Vehicle class for definition of "equal"). See the docstring of the add()
 * method to see what should happen when adding a duplicate vehicle.
 * </p>
 */
public class AutoShop {
    /**
     * The HashSet hold all vehicles belonging to this Auto shop
     */
    private final HashSet<Vehicle> vehicles;

    /**
     * The owner of Auto shop
     */
    private ShopOwner owner;

    /**
     * Initializes this auto shop so that it has the specified owner and no
     * vehicles.
     *
     * @param owner the owner of this auto shop
     */
    public AutoShop(ShopOwner owner) {
        this.owner = owner;
        this.vehicles = new HashSet<>();
        // TODO: COMPLETE THIS
    }

    /**
     * Initializes this auto shop by copying another auto shop. This auto shop will
     * have the same owner and the same number and type of vehicles as the other
     * auto shop.
     *
     * @param other the auto shop to copy
     */
    public AutoShop(AutoShop other) {
        this.owner = other.owner;
        this.vehicles = new HashSet<>(other.vehicles);

        // TODO: COMPLETE THIS
    }

    private boolean checkOwner(ShopOwner owner){
        if (owner.getID() == this.owner.getID() && owner.getName().equals(this.owner.getName())){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Returns the owner of this auto shop.
     *
     * <p>
     * This method is present only for testing purposes. Returning the owner of this
     * auto shop allows any user to sell vehicles from the auto shop (because any
     * user can get the owner of this auto shop)!
     *
     * @return the owner of this auto shop
     */
     ShopOwner getOwner() {

        // ALREADY IMPLEMENTED; DO NOT MODIFY
        return this.owner;
    }

    /**
     * Returns the set of vehicles of this auto shop.
     *
     * <p>
     * This method is present only for testing purposes.
     *
     * @return the set of vehicles kept in the auto shop
     */
    Set<Vehicle> getVehicles() {

        // ALREADY IMPLEMENTED; DO NOT MODIFY
        return this.vehicles;
    }

    /**
     * Allows the current owner of this auto shop to give this auto shop to a new
     * owner.
     *
     * @param currentOwner the current owner of this auto shop
     * @param newOwner     the new owner of this auto shop
     * @throws IllegalArgumentException if currentOwner is not the current owner of
     *                                  this auto shop
     */
    public void changeOwner(ShopOwner currentOwner, ShopOwner newOwner) {
        if(checkOwner(currentOwner)){
            owner = newOwner;
        }
        else {
            throw new IllegalArgumentException("The currentOwner is not the current owner of this auto shop");
        }
        // TODO: COMPLETE THIS
    }

    /**
     * Adds the specified vehicles to this auto shop.
     * If any of the input vehicle already exists in the auto shop,
     * throw an exception and <strong>do NOT add any vehicle to the shop</strong>.
     *
     * <p>
     * You may assume that the input list does NOT have any duplicate.
     * </p>
     *
     * @param vehicles a list of vehicles to add to this auto shop
     * @throws IllegalArgumentException if any input vehicle already exists in the shop
     */
    public void add(List<Vehicle> vehicles) {
        if (this.vehicles.size() == 0){
            for (int i = 0; i < vehicles.size(); i++){
                this.vehicles.add(vehicles.get(i));
            }
        }
        else{
            boolean match = false;
            int ctr = 0;
            while (!match && ctr < vehicles.size()){
                if (this.vehicles.contains(vehicles.get(ctr))){
                    match = true;
                }
                ctr++;
            }
            if (match){
                throw new IllegalArgumentException("Trying to add cars that are already exist in auto shop");
            }
            else{
                for (int i = 0; i < vehicles.size(); i++){
                    this.vehicles.add(vehicles.get(i));
                }
            }
        }
        // TODO: COMPLETE THIS
    }

    /**
     * Returns true if this auto shop contains the specified vehicle, and false
     * otherwise.
     *
     * @param vehicle a vehicle
     * @return true if this auto shop contains the specified vehicle, and false
     * otherwise
     */
    public boolean contains(Vehicle vehicle) {
        return vehicles.contains(vehicle);
        // TODO: COMPLETE THIS
    }

    /**
     * Allows the owner of this auto shop to sell a single vehicle equal to the
     * specified vehicle from this auto shop.
     *
     * <p>
     * If the specified user is not equal to the owner of this auto shop, then the
     * vehicle is not sold from this auto shop, and null is returned.
     * <p>
     * If the specified vehicle does not exist in the auto shop, then the
     * vehicle is not sold from this auto shop, and null is returned.
     *
     * @param user    the person trying to sell the vehicle
     * @param vehicle a vehicle
     * @return a vehicle equal to the specified vehicle from this auto shop, or null
     * if user is not the owner of this auto shop or the vehicle does not exist.
     */
    public Vehicle sellingSingleVehicle(ShopOwner user, Vehicle vehicle) {
        if (checkOwner(user) && vehicles.contains(vehicle)){
            vehicles.remove(vehicle);
            return vehicle;
        }
        else{
            return null;
        }
        // TODO: COMPLETE THIS
    }

    /**
     * Returns a deep copy of the vehicles in this auto shop as a list. The returned list
     * has its vehicles in sorted order (from the smallest price value to the largest price
     * value).
     *
     * @return a deep copy of the list of vehicles in this auto shop
     */
    public List<Vehicle> deepCopy() {
        List<Vehicle> list = new ArrayList<>(vehicles);
        ArrayList<Vehicle> copy = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){
            Vehicle v = new Vehicle(list.get(i));
            copy.add(v);
        }
        Collections.sort(copy);
        return copy;
        // TODO: COMPLETE THIS
    }

    /**
     * Returns a Shallow copy of the vehicles in this auto shop as a list. The returned list
     * has its vehicles in sorted order (from the smallest price value to the largest price
     * value).
     *
     * @return a show copy of the list of the vehicles in this auto shop
     */
    public List<Vehicle> shallowCopy() {
        ArrayList<Vehicle> copyList = new ArrayList<>(vehicles);
        Collections.sort(copyList);
        return copyList;

        // TODO: COMPLETE THIS
    }
}
