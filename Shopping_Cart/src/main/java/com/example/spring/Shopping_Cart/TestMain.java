package com.example.spring.Shopping_Cart;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Service.xml");
		Service service = (Service) context.getBean("beanService");
		// System.out.println(service.getCategory().getCategoryName());
		// System.out.println(service.getProduct().getProductName());
		// System.out.println(service.getProdDetails().getProductDetails());
		// Getting Category id
		Set<String> categoryIdSet = service.getCategory().getCategoryName().keySet();
		// Getting Product id
		Set<String> productIdSet = service.getProduct().getProductName().keySet();
		Set<String> productDetailsIdSet = service.getProdDetails().getProductDetails().keySet();

		for (String cid : categoryIdSet) {

			System.out.println("Category id is: " + cid);
			System.out.println("Category name is: " + service.getCategory().getCategoryName().get(cid));

			for (String pid : productIdSet) {

				if (cid.equals("1")) {
					if ((pid.equals("11") || pid.equals("44"))) {

						System.out.println("Product id is: " + pid);
						System.out.println("Product name is: " + service.getProduct().getProductName().get(pid));
						for (String pdid : productDetailsIdSet) {
							if (pid.equals("11")) {
								if (pdid.equals("111") || pdid.equals("222")) {
									System.out.println("Product details id is: " + pdid);

									System.out.println("Product details name is: "
											+ service.getProdDetails().getProductDetails().get(pdid));
								}
							}
							if (pid.equals("44")) {
								if (pdid.equals("777") || pdid.equals("888")) {
									System.out.println("Product details id is: " + pdid);

									System.out.println("Product details name is: "
											+ service.getProdDetails().getProductDetails().get(pdid));
								}
							}
						}
					}
				} else if (cid.equals("2")) {
					if ((pid.equals("22") || pid.equals("44"))) {

						System.out.println("Product id is: " + pid);
						System.out.println("Product name is: " + service.getProduct().getProductName().get(pid));

						for (String pdid : productDetailsIdSet) {
							if (pid.equals("22")) {
								if (pdid.equals("333") || pdid.equals("444")) {
									System.out.println("Product details id is: " + pdid);

									System.out.println("Product details name is: "
											+ service.getProdDetails().getProductDetails().get(pdid));
								}
							}
							if (pid.equals("44")) {
								if (pdid.equals("777") || pdid.equals("888")) {
									System.out.println("Product details id is: " + pdid);

									System.out.println("Product details name is: "
											+ service.getProdDetails().getProductDetails().get(pdid));
								}
							}
						}
					}
				} else if (cid.equals("3")) {
					if ((pid.equals("33") || pid.equals("44"))) {

						System.out.println("Product id is: " + pid);
						System.out.println("Product name is: " + service.getProduct().getProductName().get(pid));

						for (String pdid : productDetailsIdSet) {
							if (pid.equals("33")) {
								if (pdid.equals("555") || pdid.equals("666")) {
									System.out.println("Product details id is: " + pdid);

									System.out.println("Product details name is: "
											+ service.getProdDetails().getProductDetails().get(pdid));
								}
							}
							if (pid.equals("44")) {
								if (pdid.equals("777") || pdid.equals("888")) {
									System.out.println("Product details id is: " + pdid);

									System.out.println("Product details name is: "
											+ service.getProdDetails().getProductDetails().get(pdid));
								}
							}
						}
					}
				} else {
					System.out.println("Categories not supported ");

				}

			}
		}

	}

}
