package com.firebase.samples.logindemo;

/**
 * Created by Marianne on 13-05-2016.
 */
import android.os.Parcel;
import android.os.Parcelable;

public class Product implements Parcelable {

    private String name;
    private int quantity;

// get and set method

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public String toString() {
        return quantity+ " "+ name;
    }

    public Product(String name, int quantity)
    {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(quantity);
    }



    // "De-parcel object
    public Product(Parcel in) {
        name = in.readString();
        quantity = in.readInt();
    }


    // We need to add a Creator
    public static final Parcelable.Creator<Product> CREATOR = new Parcelable.Creator<Product>() {

        @Override
        public Product createFromParcel(Parcel parcel) {
            return new Product(parcel);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }

    };
    public Product()
    {

    }
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {

        this.name =name;
    }
    //
    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {

        this.quantity =quantity;
    }


}
