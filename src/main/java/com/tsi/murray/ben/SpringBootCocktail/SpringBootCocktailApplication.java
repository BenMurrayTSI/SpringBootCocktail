package com.tsi.murray.ben.SpringBootCocktail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@SpringBootApplication
@RestController

@RequestMapping("/CDB")
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

	@GetMapping("/cocktail/id/{CocktailID}")
	public Optional<Cocktail> getCocktailByID(@PathVariable(value = "CocktailID") int CocktailID) {
		return cocktailRepository.findById(CocktailID);
	}

	@PostMapping("/cocktail/new")
	public @ResponseBody String postNewCocktail (@RequestParam String Name, @RequestParam String Type, @RequestParam int Volume) {
		Cocktail newCocktail = new Cocktail(Name, Type, Volume);
		cocktailRepository.save(newCocktail);
		return "Saved new cocktail.";
	}

	@DeleteMapping("/cocktail/delete/{CocktailID}")
	public @ResponseBody String deleteCocktail(@PathVariable(value = "CocktailID") int CocktailID) {
		cocktailRepository.deleteById(CocktailID);
		return "Deleted cocktail.";
	}



	//EQUIPMENT
	@GetMapping("/equipment")
	public @ResponseBody Iterable<Equipment> getAllEquipment() {
		return equipmentRepository.findAll();
	}

	@GetMapping("/equipment/id/{EquipmentID}")
	public Optional<Equipment> getEquipmentByID(@PathVariable(value = "EquipmentID") int EquipmentID) {
		return equipmentRepository.findById(EquipmentID);
	}

	@PostMapping("/equipment/new")
	public @ResponseBody String postNewEquipment (@RequestParam String Name, @RequestParam String Type, @RequestParam int Power) {
		Equipment newEquipment = new Equipment(Name, Type, Power);
		equipmentRepository.save(newEquipment);
		return "Saved new equipment.";
	}

	@DeleteMapping("/equipment/delete/{EquipmentID}")
	public @ResponseBody String deleteEquipment(@PathVariable(value = "EquipmentID") int EquipmentID) {
		equipmentRepository.deleteById(EquipmentID);
		return "Deleted equipment.";
	}



	//GARNISH
	@GetMapping("/garnish")
	public @ResponseBody Iterable<Garnish> getAllGarnish() {
		return garnishRepository.findAll();
	}

	@GetMapping("/garnish/id/{GarnishID}")
	public Optional<Garnish> getGarnishByID(@PathVariable(value = "GarnishID") int GarnishID) {
		return garnishRepository.findById(GarnishID);
	}

	@PostMapping("/garnish/new")
	public @ResponseBody String postNewGarnish (@RequestParam String Name, @RequestParam String Type) {
		Garnish newGarnish = new Garnish(Name, Type);
		garnishRepository.save(newGarnish);
		return "Saved new garnish.";
	}

	@DeleteMapping("/garnish/delete/{GarnishID}")
	public @ResponseBody String deleteGarnish(@PathVariable(value = "GarnishID") int GarnishID) {
		garnishRepository.deleteById(GarnishID);
		return "Deleted garnish.";
	}



	//GLASS
	@GetMapping("/glass")
	public @ResponseBody Iterable<Glass> getAllGlass() {
		return glassRepository.findAll();
	}

	@GetMapping("/glass/id/{GlassID}")
	public Optional<Glass> getGlassByID(@PathVariable(value = "GlassID") int GlassID) {
		return glassRepository.findById(GlassID);
	}

	@PostMapping("/glass/new")
	public @ResponseBody String postNewGlass (@RequestParam String Type, @RequestParam int Volume) {
		Glass newGlass = new Glass(Type, Volume);
		glassRepository.save(newGlass);
		return "Saved new glass.";
	}

	@DeleteMapping("/glass/delete/{GlassID}")
	public @ResponseBody String deleteGlass(@PathVariable(value = "GlassID") int GlassID) {
		glassRepository.deleteById(GlassID);
		return "Deleted glass.";
	}



	//INGREDIENT
	@GetMapping("/ingredient")
	public @ResponseBody Iterable<Ingredient> getAllIngredient() {
		return ingredientRepository.findAll();
	}

	@GetMapping("/ingredient/id/{IngredientID}")
	public Optional<Ingredient> getIngredientByID(@PathVariable(value = "IngredientID") int IngredientID) {
		return ingredientRepository.findById(IngredientID);
	}

	@PostMapping("/ingredient/new")
	public @ResponseBody String postNewIngredient (@RequestParam String Name, @RequestParam double ABV, @RequestParam String Storage, @RequestParam String Description) {
		Ingredient newIngredient = new Ingredient(Name, ABV, Storage, Description);
		ingredientRepository.save(newIngredient);
		return "Saved new ingredient.";
	}

	@DeleteMapping("/ingredient/delete/{IngredientID}")
	public @ResponseBody String deleteIngredient(@PathVariable(value = "IngredientID") int IngredientID) {
		ingredientRepository.deleteById(IngredientID);
		return "Deleted ingredient.";
	}



	//INSTRUCTION
	@GetMapping("/instruction")
	public @ResponseBody Iterable<Instruction> getAllInstruction() {
		return instructionRepository.findAll();
	}

	@GetMapping("/instruction/id/{InstructionID}")
	public Optional<Instruction> getInstructionByID(@PathVariable(value = "InstructionID") int InstructionID) {
		return instructionRepository.findById(InstructionID);
	}

	@PostMapping("/instruction/new")
	public @ResponseBody String postNewInstruction (@RequestParam String Description) {
		Instruction newInstruction = new Instruction(Description);
		instructionRepository.save(newInstruction);
		return "Saved new instruction.";
	}

	@DeleteMapping("/instruction/delete/{InstructionID}")
	public @ResponseBody String deleteInstruction(@PathVariable(value = "InstructionID") int InstructionID) {
		instructionRepository.deleteById(InstructionID);
		return "Deleted instruction.";
	}

}


