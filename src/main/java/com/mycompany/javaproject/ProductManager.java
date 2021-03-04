/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaproject;


public class ProductManager extends BaseManager {
    Product[] products;
    private int size;
    private int capacity;

    ProductManager(){
        size = 0;
        capacity = 1;
        products = new Product[1];
        initialize();
    }

    public int getSize() {
        return size;
    }
    
    private void initialize(){
        AddProduct("T-Shirt",500,80);
        AddProduct("Shirt",250,250);
        AddProduct("Trousers",100,200);
        AddProduct("Shorts",300,100);
        AddProduct("Sweater",150,100);
        AddProduct("Jacket",50,100);
        AddProduct("Mounted",50,1000);
        AddProduct("Coat",75,750);
        AddProduct("Boxer",120,7500);
        AddProduct("Athlete",120,7500);
        AddProduct("Socks",1200,10);
        AddProduct("Gloves",100,25);
        AddProduct("Bra",100,7500);
        AddProduct("Wallet",45,150);
        AddProduct("Watch",120,1500);
    }

    public void AddProduct(String name,int stockAmount,int prize){
        if(size == capacity)
            ensureCapacity();
        products[size]=new Product();
        products[size].setNameProduct(name);
        products[size].setIdProduct(size+1);
        products[size].setCodeProduct();
        products[size].setStockAmount(stockAmount);
        products[size].setPrize(prize);
        size++;
    }
    public void AddProduct(String name,int prize){
        if(size == capacity)
            ensureCapacity();
        products[size]=new Product();
        products[size].setNameProduct(name);
        products[size].setIdProduct(size+1);
        products[size].setCodeProduct();
        products[size].setPrize(prize);
        size++;
    }
    @Override
    public void Remove(int id){
        boolean removed=false;
        for (int index = 0; index < products.length; index++) {
            if (products[index].getIdProduct()== id) {
                for (int tempIndex = index; tempIndex <= products.length - 1; tempIndex++) {
                    if (tempIndex == products.length - 1) {
                        products[tempIndex] = null;
                        reduceCapacity();
                        size--;
                        break;
                    } else
                        products[tempIndex] = products[tempIndex + 1];
                }
                removed = true;
            }
        }
    }

    @Override
    void ensureCapacity() {
        Product[] tempProduct = new Product[capacity + 1];

        for (int i = 0; i < capacity; i++) {
            tempProduct[i] = products[i];
        }
        products = tempProduct;
        capacity = capacity + 1;
    }
    
    @Override
    void reduceCapacity() {
        Product[] tempProduct = new Product[capacity - 1];

        for (int i = 0; i < capacity-1; i++) {
            tempProduct[i] = products[i];
        }
        products = tempProduct;
        capacity = capacity - 1;
    }

}
