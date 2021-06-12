package repositories.temporaryRepos;

import model.inventory.Ingredient;
import repositories.IRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class IngredientTempRepo implements IRepository<Ingredient,Integer> {

    static IngredientTempRepo instance;
    Map<Integer,Ingredient> map =new HashMap<>();
    Integer lastID = 0;
    private Ingredient i;


    private IngredientTempRepo() {
    }

    public static IngredientTempRepo getInstance(){
        instance = (instance==null) ? new IngredientTempRepo() : instance;
        return instance;
    }
    @Override
    public void create(Ingredient model) {
        model.setId(lastID++);
        map.put(model.getId(),model);
    }

    @Override
    public void delete(Integer id) {
        map.remove(id);
    }

    @Override
    public Ingredient get(Integer id) {
        return map.get(id);
    }

    @Override
    public void update(Ingredient model) {
        map.remove(model.getId());
        map.put(model.getId(), model);
    }

    @Override
    public Collection<Ingredient> getAll() {
        return map.values();
    }

}
