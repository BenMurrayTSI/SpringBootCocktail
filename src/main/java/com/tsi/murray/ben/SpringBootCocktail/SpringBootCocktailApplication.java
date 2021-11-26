package com.tsi.murray.ben.SpringBootCocktail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController

public class SpringBootCocktailApplication {

	@Autowired
	private CocktailRepository cocktailRepository;
	@Autowired
	private EquipmentRepository equipmentRepository;
	@Autowired
	private GarnishRepository garnishRepository;
	@Autowired
	private GlassRepository glassRepository;
	@Autowired
	private IngredientRepository ingredientRepository;
	@Autowired
	private InstructionRepository instructionRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCocktailApplication.class, args);
	}


	//COCKTAIL
	@GetMapping("/cocktail/allCocktail")
	public @ResponseBody Iterable<Cocktail> getAllCocktail() {
		return cocktailRepository.findAll();
	}

	@PostMapping("/cocktail/addCocktail")
	public @ResponseBody String addCocktail (@RequestParam String Name, @RequestParam String Type, @RequestParam int Volume) {
		Cocktail newCocktail = new Cocktail(Name, Type, Volume);
		cocktailRepository.save(newCocktail);
		return "Saved new cocktail.";
	}


	//EQUIPMENT
	@GetMapping("/equipment/allEquipment")
	public @ResponseBody Iterable<Equipment> getAllEquipment() {
		return equipmentRepository.findAll();
	}

	@PostMapping("/equipment/addEquipment")
	public @ResponseBody String addEquipment (@RequestParam String Name, @RequestParam String Type, @RequestParam int Power) {
		Equipment newEquipment = new Equipment(Name, Type, Power);
		equipmentRepository.save(newEquipment);
		return "Saved new equipment.";
	}


	//GARNISH
	@GetMapping("/garnish/allGarnish")
	public @ResponseBody Iterable<Garnish> getAllGarnish() {
		return garnishRepository.findAll();
	}

	@PostMapping("/garnish/addGarnish")
	public @ResponseBody String addGarnish (@RequestParam String Name, @RequestParam String Type) {
		Garnish newGarnish = new Garnish(Name, Type);
		garnishRepository.save(newGarnish);
		return "Saved new garnish.";
	}


	//GLASS
	@GetMapping("/glass/allGlass")
	public @ResponseBody Iterable<Glass> getAllGlass() {
		return glassRepository.findAll();
	}

	@PostMapping("/glass/addGlass")
	public @ResponseBody String addGlass (@RequestParam String Type, @RequestParam int Volume) {
		Glass newGlass = new Glass(Type, Volume);
		glassRepository.save(newGlass);
		return "Saved new glass.";
	}


	//INGREDIENT
	@GetMapping("/ingredient/allIngredient")
	public @ResponseBody Iterable<Ingredient> getAllIngredient() {
		return ingredientRepository.findAll();
	}

	@PostMapping("/ingredient/addIngredient")
	public @ResponseBody String addIngredient (@RequestParam String Name, @RequestParam double ABV, @RequestParam String Storage, @RequestParam String Description) {
		Ingredient newIngredient = new Ingredient(Name, ABV, Storage, Description);
		ingredientRepository.save(newIngredient);
		return "Saved new ingredient.";
	}


	//INSTRUCTION
	@GetMapping("/instruction/allInstruction")
	public @ResponseBody Iterable<Instruction> getAllInstruction() {
		return instructionRepository.findAll();
	}

	@PostMapping("/instruction/addInstruction")
	public @ResponseBody String addInstruction (@RequestParam String Description) {
		Instruction newInstruction = new Instruction(Description);
		instructionRepository.save(newInstruction);
		return "Saved new instruction.";
	}
}


