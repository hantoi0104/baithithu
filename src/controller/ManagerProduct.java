package controller;

import conparator.SortByDown;
import conparator.SortByUP;
import io.ReadAndWrite;
import model.Product;
import servies.ServicesProduct;
import validate.Validate;

import java.util.ArrayList;
import java.util.Scanner;

import static servies.ServicesProduct.list_Product;


public class ManagerProduct {
    private ServicesProduct servicesProduct;
    Scanner sc = new Scanner(System.in);

    public void menu() {
        showMenu();
        int choice = getChoice();
        switch (choice) {
            case 1:
                show(list_Product);
                break;
            case 2:
                addProduct(createProduct());
                break;
            case 3:
                editProduct();
                break;
            case 4:
                deleteProduct();
                break;
            case 5:
                sort();
                break;
            case 6:
                findMaxPrice(list_Product);
                break;
            case 7:
                writeFile();
                break;
            case 8:
                readFile();
                break;
        }
    }

    public void show(ArrayList<Product> list) {
        for (Product x : list) {
            System.out.println(x.toString());
        }
    }

    public void addProduct(Product product) {
        list_Product.add(product);


    }

    public Product createProduct() {
        String name = getNameProduct();
        int id = getIdProduct();
        float price = getPriceProduct();
        int quantity = getQuantityProduct();
        String dis = getDisProduct();
        return new Product(name, id, price, quantity, dis);
    }

    public void editProduct() {
        int idEdit = getIdProduct();
        int index = getIndexId(idEdit);
        while (index == -1) {
            idEdit = getIdProduct();
            index = getIndexId(idEdit);
        }
        list_Product.set(index, createProduct());

    }

    public void deleteProduct() {
        int idDelete = getIdProduct();
        int index = getIndexId(idDelete);
        while (index == -1) {
            idDelete = getIdProduct();
            index = getIndexId(idDelete);
        }
        list_Product.remove(index);
    }


    public int getIndexId(int id) {
        for (int i = 0; i < list_Product.size(); i++) {
            if (id == list_Product.get(i).getPrice())
                return i;
        }
        return -1;

    }

    public int getChoice() {
        String choice = sc.nextLine();
        while (!Validate.validateMenuChoice(choice)) {
            System.out.println("Nhập sai, nhập lại");
            choice = sc.nextLine();
        }
        return Integer.parseInt(choice);
    }


    public int getIdProduct() {
        int id;
        System.out.println("Nhập vào ID sản phẩm");
        String inputID = sc.nextLine();
        while (!Validate.validateMenuChoice(inputID)) {
            System.out.println("Nhập sai, nhập lại");
            inputID = sc.nextLine();
        }
        id = Integer.parseInt(inputID);
        return id;
    }

    public String getNameProduct() {
        System.out.println("Nhập vào tên sản phẩm");
        String name = sc.nextLine();
        while (!Validate.validateNameProduct(name)) {
            System.out.println("Chữ cái đầu phải viết hoa, tên phải là ký tự từ 0-9 a-Z )");
            name = sc.nextLine();
        }
        return name;
    }


    public float getPriceProduct() {
        System.out.println("Nhập vào giá sản phẩm");
        String price = sc.nextLine();
        while (!Validate.validatePriceProduct(price)) {
            System.out.println(" 1-9");
            price = sc.nextLine();
        }
        return Float.parseFloat(price);
    }

    public int getQuantityProduct() {
        System.out.println("Nhập vào số lượng sản phẩm");
        String quantity = sc.nextLine();
        while (!Validate.validateQuantityProduct(quantity)) {
            System.out.println("Chữ cái đầu phải viết hoa, tên phải là ký tự từ 0-9 a-Z )");
            quantity = sc.nextLine();
        }
        return Integer.parseInt(quantity);
    }

    public String getDisProduct() {
        System.out.println("Nhập vào mô tả sản phẩm");
        String dis = sc.nextLine();
        while (!Validate.validateDisProduct(dis)) {
            System.out.println("sai");
            dis = sc.nextLine();
        }
        return dis;
    }


    public void showMenu() {
        System.out.println(" ---CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM---");
        System.out.println("1. Xem danh sách ");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhập");
        System.out.println("4. Xóa");
        System.out.println("5. Sắp xếp");
        System.out.println("6. Tìm sản phẩm có giá đắt nhất");
        System.out.println("7. Đọc từ file");
        System.out.println("8. Ghi từ ");
        System.out.println("9. Thoát");
    }

    public void sortUpList(ArrayList<Product> products) {
        products.sort(new SortByUP());
    }


    public void sortDownList(ArrayList<Product> products) {
        products.sort(new SortByDown());
    }

    public void sort() {
        System.out.println("1. Sort UP");
        System.out.println("2. Sort Down");
        System.out.println("3. Exit");
        int choice1 = getChoice();
        switch (choice1) {
            case 1:
                sortUpList(list_Product);
                break;
            case 2:
                sortDownList(list_Product);
                break;
            case 3:
                menu();
                break;
        }
    }

    public void findMaxPrice(ArrayList<Product> products) {
        float max = products.get(0).getPrice();
        for (Product x : products) {
            if (x.getPrice() > max)
                max = x.getPrice();
        }
        System.out.println(max);
    }

    public void readFile() {
        list_Product = ReadAndWrite.reader();
    }

    public void writeFile() {
        ReadAndWrite.Write(list_Product);
    }
}







