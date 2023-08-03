package standard;

public class BrandUtil extends Brand {
public static void run(Brand brand)
	
	{
		if(brand instanceof LocalBrand)
		{
			System.out.println("Invoking LocalBrand");
			LocalBrand localBrand=(LocalBrand)brand;
			System.out.println(localBrand.name);
			System.out.println(localBrand.quality);
			localBrand.look();
			localBrand.style();
			System.out.println("*********");
		}
		if(brand instanceof NationalBrand)
		{
			System.out.println("Invoking NationalBrand");
			NationalBrand nationalBrand=(NationalBrand)brand;
			System.out.println(nationalBrand.name);
			System.out.println(nationalBrand.location);
			nationalBrand.brandClarity();
			nationalBrand.style();
			System.out.println("*********");
		}
		if(brand instanceof DuplicateBrand)
		{
			System.out.println("Invoking DuplicateBrand");
			DuplicateBrand duplicateBrand=(DuplicateBrand)brand;
			System.out.println(duplicateBrand.name);
			System.out.println(duplicateBrand.icon);
			duplicateBrand.purpose();
			duplicateBrand.style();
			System.out.println("*********");
		}
		if(brand instanceof InternationalBrand)
		{
			System.out.println("Invoking InternationalBrand");
			InternationalBrand internationalBrand=(InternationalBrand)brand;
			System.out.println(internationalBrand.name);
			System.out.println(internationalBrand.price);
			internationalBrand.material();
			internationalBrand.style();
			System.out.println("*********");
		}
	}
}
