package com.xworkz.Repository.boot;

import com.xworkz.Repository.app.ArtistRepository;
import com.xworkz.Repository.app.GroceryRepository;
import com.xworkz.Repository.app.HistoricalRepo;
import com.xworkz.Repository.app.Medicine;
import com.xworkz.Repository.app.Patient;
import com.xworkz.Repository.app.Pilot;
import com.xworkz.Repository.app.PoliticanRepository;
import com.xworkz.Repository.app.impl.ArtistRepositoryImpl;
import com.xworkz.Repository.app.impl.GoceryRepositoryimpl;
import com.xworkz.Repository.app.impl.HistoricalImpl;
import com.xworkz.Repository.app.impl.MedicineImpl;
import com.xworkz.Repository.app.impl.PatientImpl;
import com.xworkz.Repository.app.impl.PilotImpl;
import com.xworkz.Repository.app.impl.PoliticanRepositoryImpl;
import com.xworkz.Repository.app.service.ArtistService;
import com.xworkz.Repository.app.service.ArtistServiceImpl;
import com.xworkz.Repository.app.service.GroceryService;
import com.xworkz.Repository.app.service.GroceryServiceImpl;
import com.xworkz.Repository.app.service.HistoricalService;
import com.xworkz.Repository.app.service.HistoricalServiceImpl;
import com.xworkz.Repository.app.service.MedicineService;
import com.xworkz.Repository.app.service.MedicineServiceImpl;
import com.xworkz.Repository.app.service.PatientService;
import com.xworkz.Repository.app.service.PatientServiceImpl;
import com.xworkz.Repository.app.service.PilotService;
import com.xworkz.Repository.app.service.PilotServiceImpl;
import com.xworkz.Repository.app.service.PoliticanService;
import com.xworkz.Repository.app.service.PoliticanServiceImpl;

public class AllRunner {

	public static void main(String[] args) {
			System.out.println("\n");
			System.out.println("----------------------GROCERY-SERVICE-----------");
			System.out.println("\n");

			GroceryRepository groceryRepository=new GoceryRepositoryimpl();

			GroceryService service=new GroceryServiceImpl(groceryRepository);
			service.save("Sugar");
			service.save("Chilli");
			service.save("Milk Powder");
			service.save("Oil");
			service.save("Toothpaste");
			service.save("Detergent");
			service.save("Chicken Masala Powder");
			service.save("Matton Masala Powder");
			service.save("Rasam Powder");
			service.save("Egg");
			service.save("Sugar");

			System.out.println("\n");
			System.out.println("----------------------ARTIST-SERVICE-----------");
			System.out.println("\n");

			ArtistRepository artistRepository=new ArtistRepositoryImpl();

			ArtistService artist=new ArtistServiceImpl(artistRepository);
			artist.list("Amrita Sher-Gil");
			artist.list("Jamini Roy");
			artist.list("Kalipada Goshala");
			artist.list("Maniam");
			artist.list("Manishi Dey");
			artist.list("Nandalal Bose");
			artist.list("Rabindranath Tagore");
			artist.list("Silpi");
			artist.list("Sunil Das");
			artist.list("Thakur Singh");
			artist.list("Thakur Singh");

			System.out.println("\n");
			System.out.println("----------------------HISTORICAL PLACES-SERVICE-----------");
			System.out.println("\n");

			HistoricalRepo historicalRepo=new HistoricalImpl();

			HistoricalService place=new HistoricalServiceImpl(historicalRepo);

			place.venue("Mysore");
			place.venue("Badami");
			place.venue("Aihole");
			place.venue("Halebidu");
			place.venue("Shimoga");
			place.venue("Dandeli");
			place.venue("Hampi");
			place.venue("Srirangapatna");
			place.venue("Banglore");
			place.venue("Beluru");
			place.venue("Mysore");

			System.out.println("\n");
			System.out.println("-------------------MEDICINE-SERVICE-------------------");
			System.out.println("\n");

			Medicine medicine=new MedicineImpl();

			MedicineService medicine1=new MedicineServiceImpl(medicine); 
			medicine1.list("Naproxen");
			medicine1.list("Aspirin");
			medicine1.list("Diazepen");
			medicine1.list("Ativan");
			medicine1.list("Dolo-650");
			medicine1.list("Lisinopril");
			medicine1.list("Dexamenthose");
			medicine1.list("Atvin");
			medicine1.list("Doxycycline");
			medicine1.list("");
			medicine1.list("Naproxen");
			medicine1.list("Abacavir");

			System.out.println("\n");
			System.out.println("-------------------PATIENT-------------------");
			System.out.println("\n");



			Patient patientRepository=new PatientImpl();

			PatientService patient=new PatientServiceImpl(patientRepository);
			patient.care("Harshith Kumar");
			patient.care("Jeevan K");
			patient.care("Sagar K");
			patient.care("Chandru M");
			patient.care("Prajwal B");
			patient.care("Chandan V");
			patient.care("Darshan");
			patient.care("Venu Gopal");
			patient.care("Vikas S R");
			patient.care("Naveen Mokka");
			patient.care("Harshith Kumar");
			patient.care(null);

			System.out.println("\n");
			System.out.println("-------------------POLITICIAN-SERVICE-------------------");
			System.out.println("\n");


			PoliticanRepository politicanRepository=new PoliticanRepositoryImpl();

			PoliticanService politician= (PoliticanService) new PoliticanServiceImpl(politicanRepository);
			politician.list("Narendra Modi");
			politician.list("B S Y");
			politician.list("Halappa Achar");
			politician.list("Karadi Sanganna");
			politician.list("R Ashoka");
			politician.list("B N Bache Gowda");
			politician.list("G S Basavaraj");
			politician.list("K G Bopaiah");
			politician.list("Basavaraj Bommai");
			politician.list("C K Ramamurthy");
			politician.list("B S Y");
			politician.list(null);

			System.out.println("\n");
			System.out.println("-------------------PILOT-SERVICE-------------------");
			System.out.println("\n");

			Pilot pilot1=new PilotImpl();

			PilotService pilot=new PilotServiceImpl(pilot1);

			pilot.list("Ajay");
			pilot.list("Suhas Biswas");
			pilot.list("cariappa");
			pilot.list("Anil Chopra");
			pilot.list("Rana Chinna");
			pilot.list("Vinod");
			pilot.list("Srujan Das");
			pilot.list("Divakar");
			pilot.list("Kumar");
			pilot.list("Anna malie");
			pilot.list("Roman Vishal");
			pilot.list(null);

		}

	
	}

