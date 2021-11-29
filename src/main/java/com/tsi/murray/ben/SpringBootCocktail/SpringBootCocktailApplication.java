package com.tsi.murray.ben.SpringBootCocktail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@SpringBootApplication
@RestController

@RequestMapping("/CocktailDB")
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
	@GetMapping("/cocktail")
	public @ResponseBody Iterable<Cocktail> getAllCocktail() {
		return cocktailRepository.findAll();
	}

	@GetMapping("/cocktail/{CocktailID}")
	public Optional<Cocktail> getCocktailById(@PathVariable(value = "CocktailID") int CocktailID) {
		return cocktailRepository.findById(CocktailID);
	}

	@PostMapping("/cocktail/add")
	public @ResponseBody String addCocktail (@RequestParam String Name, @RequestParam String Type, @RequestParam int Volume) {
		Cocktail newCocktail = new Cocktail(Name, Type, Volume);
		cocktailRepository.save(newCocktail);
		return "Saved new cocktail.";
	}



	//EQUIPMENT
	@GetMapping("/equipment")
	public @ResponseBody Iterable<Equipment> getAllEquipment() {
		return equipmentRepository.findAll();
	}

	@GetMapping("/equipment/{EquipmentID}")
	public Optional<Equipment> getEquipmentById(@PathVariable(value = "EquipmentID") int EquipmentID) {
		return equipmentRepository.findById(EquipmentID);
	}

	@PostMapping("/equipment/add")
	public @ResponseBody String addEquipment (@RequestParam String Name, @RequestParam String Type, @RequestParam int Power) {
		Equipment newEquipment = new Equipment(Name, Type, Power);
		equipmentRepository.save(newEquipment);
		return "Saved new equipment.";
	}



	//GARNISH
	@GetMapping("/garnish")
	public @ResponseBody Iterable<Garnish> getAllGarnish() {
		return garnishRepository.findAll();
	}

	@GetMapping("/garnish/{GarnishID}")
	public Optional<Garnish> getGarnishById(@PathVariable(value = "GarnishID") int GarnishID) {
		return garnishRepository.findById(GarnishID);
	}

	@PostMapping("/garnish/add")
	public @ResponseBody String addGarnish (@RequestParam String Name, @RequestParam String Type) {
		Garnish newGarnish = new Garnish(Name, Type);
		garnishRepository.save(newGarnish);
		return "Saved new garnish.";
	}



	//GLASS
	@GetMapping("/glass")
	public @ResponseBody Iterable<Glass> getAllGlass() {
		return glassRepository.findAll();
	}

	@GetMapping("/glass/{GlassID}")
	public Optional<Glass> getGlassById(@PathVariable(value = "GlassID") int GlassID) {
		return glassRepository.findById(GlassID);
	}

	@PostMapping("/glass/add")
	public @ResponseBody String addGlass (@RequestParam String Type, @RequestParam int Volume) {
		Glass newGlass = new Glass(Type, Volume);
		glassRepository.save(newGlass);
		return "Saved new glass.";
	}



	//INGREDIENT
	@GetMapping("/ingredient")
	public @ResponseBody Iterable<Ingredient> getAllIngredient() {
		return ingredientRepository.findAll();
	}

	@GetMapping("/ingredient/{IngredientID}")
	public Optional<Ingredient> getIngredientById(@PathVariable(value = "IngredientID") int IngredientID) {
		return ingredientRepository.findById(IngredientID);
	}

	@PostMapping("/ingredient/add")
	public @ResponseBody String addIngredient (@RequestParam String Name, @RequestParam double ABV, @RequestParam String Storage, @RequestParam String Description) {
		Ingredient newIngredient = new Ingredient(Name, ABV, Storage, Description);
		ingredientRepository.save(newIngredient);
		return "Saved new ingredient.";
	}



	//INSTRUCTION
	@GetMapping("/instruction")
	public @ResponseBody Iterable<Instruction> getAllInstruction() {
		return instructionRepository.findAll();
	}

	@GetMapping("/instruction/{InstructionID}")
	public Optional<Instruction> getInstructionById(@PathVariable(value = "InstructionID") int InstructionID) {
		return instructionRepository.findById(InstructionID);
	}

	@PostMapping("/instruction/add")
	public @ResponseBody String addInstruction (@RequestParam String Description) {
		Instruction newInstruction = new Instruction(Description);
		instructionRepository.save(newInstruction);
		return "Saved new instruction.";
	}

}


