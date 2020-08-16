package com;

import java.util.List;

import com.aasoapexample.Product;
import com.aasoapexample.ProductCatelogCont;
import com.aasoapexample.ProductCatelogContImplService;

public class Main {

	public static void main(String[] args) {
		try {

			ProductCatelogContImplService proCatImplServ = new ProductCatelogContImplService();
			ProductCatelogCont proCatCon = proCatImplServ.getProductCatelogContImplPort();

			System.out.println("------------------List All Values --------------------------");

			List<Product> pro = proCatCon.getAllProductCont();

			for (Product product : pro) {
				System.out.println("product values " + product.getProductName() + " " + product.getProductId());
			}
			System.out.println("------------------Add Values --------------------------");
			proCatCon.addProductCont("KeyBoard", 45826f);
			System.out.println("------------------After Adding Values --------------------------");
			List<Product> prod = proCatCon.getAllProductCont();

			for (Product product : prod) {
				System.out.println("product values " + product.getProductName() + " " + product.getProductId());
			}

			System.out.println("------------------Update Values --------------------------");
			proCatCon.updateProductCont(37, "pendrive", 5613.89f);

			System.out.println("------------------After Update --------------------------");
			List<Product> proc = proCatCon.getAllProductCont();

			for (Product product : proc) {
				System.out.println("product values " + product.getProductName());
			}

			System.out.println("------------------Delete --------------------------");
			proCatCon.deleteProductCont(36);
			System.out.println("------------------After Delete --------------------------");
			
			List<Product> procd = proCatCon.getAllProductCont();

			for (Product product : procd) {
				System.out.println("product values " + product.getProductName());
			}

		

		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
