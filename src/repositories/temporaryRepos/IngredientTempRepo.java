package repositories.temporaryRepos;

import model.inventory.Ingredient;
import repositories.IRepository;

import java.util.HashMap;
import java.util.Map;

public class IngredientTempRepo implements IRepository<Ingredient,Integer> {

    static IngredientTempRepo instance;
    Map<Integer,Ingredient> list =new HashMap<>();
    private Ingredient i;


    private IngredientTempRepo() {
    }

    public static IngredientTempRepo getInstance(){
        instance = (instance==null) ? new IngredientTempRepo() : instance;
        return instance;
    }
    @Override
    public void create(Ingredient model) {
        list.put(model.getId(),model);
    }

    @Override
    public void delete(Integer id) {
        list.remove(id);
    }

    @Override
    public Ingredient get(Integer id) {
        return list.get(id);
    }

    @Override
    public void update(Ingredient model) {
        list.remove(model.getId());
        list.put(model.getId(), model);
    }

    @Override
    public Map<Integer,Ingredient> getAll() {
        return list;
    }

}
