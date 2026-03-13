@RestController
@CrossOrigin
@RequestMapping("/api/items")
public class ItemController {

    private final ItemRepository repo;

    public ItemController(ItemRepository repo){
        this.repo = repo;
    }

    @GetMapping
    public List<Item> getAll(){
        return repo.findAll();
    }

    @PostMapping
    public Item create(@RequestBody Item item){
        return repo.save(item);
    }
}