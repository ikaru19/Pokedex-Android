package com.syafrizal.dtsproyek1;

import com.syafrizal.dtsproyek1.models.Item;
import com.syafrizal.dtsproyek1.models.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class GenerateData {
        public static List<Pokemon> getPokemons(){
           List<Pokemon> pokemons = new ArrayList<>();

            pokemons.add(new Pokemon("Bulbasaur","Grass","https://assets.pokemon.com/assets/cms2/img/pokedex/full/001.png","For some time after its birth, it grows by gaining nourishment from the seed on its back.",45,49,49,45,65,65,0.7,0,"Chlorophyll, Overgrow",6.9,87.5,12.5,5100,"Ivysaur"));
            pokemons.add(new Pokemon("Ivysaur","Grass","https://assets.pokemon.com/assets/cms2/img/pokedex/full/002.png","When the bud on its back starts swelling, a sweet aroma wafts to indicate the flowers coming bloom.",60,62,63,60,80,80,1,0,"Chlorophyll, Overgrow",13,87.5,12.5,5100,"Venusaur"));
            pokemons.add(new Pokemon("Venusaur","Grass","https://assets.pokemon.com/assets/cms2/img/pokedex/full/003.png","After a rainy day, the flower on its back smells stronger. The scent attracts other Pokémon.",80,82,83,80,100,100,2,0,"Chlorophyll, Overgrow",100,87.5,12.5,5100,"Venusaur"));
            pokemons.add(new Pokemon("Charmander","Fire","https://assets.pokemon.com/assets/cms2/img/pokedex/full/004.png","The fire on the tip of its tail is a measure of its life. If healthy, its tail burns intensely.",39,52,43,65,60,50,0.6,0,"Blaze, Solar-power",8.5,87.5,12.5,5100,"Charmeleon"));
            pokemons.add(new Pokemon("Charmeleon","Fire","https://assets.pokemon.com/assets/cms2/img/pokedex/full/005.png","In the rocky mountains where Charmeleon live, their fiery tails shine at night like stars.",58,64,58,80,80,65,1.1,0,"Blaze, Solar-power",19,87.5,12,5100,"1"));
            pokemons.add(new Pokemon("Charizard","Fire","https://assets.pokemon.com/assets/cms2/img/pokedex/full/006.png","It is said that Charizards fire burns hotter if it has experienced harsh battles.",78,84,78,100,109,85,1.7,0,"Blaze, Solar-power",90.5,87.5,12.5,5100,"1"));
            pokemons.add(new Pokemon("Squirtle","Water","https://assets.pokemon.com/assets/cms2/img/pokedex/full/007.png","It shelters itself in its shell then strikes back with spouts of water at every opportunity.",44,48,65,43,50,64,0.5,0,"Rain-dish, Torrent",9,87.5,12.5,5100,"1"));
            pokemons.add(new Pokemon("Wartortle","water","https://assets.pokemon.com/assets/cms2/img/pokedex/full/008.png","It is said to live 10,000 years. Its furry tail is popular as a symbol of longevity.",59,63,80,58,65,80,1,0,"Rain-dish, Torrent",22.5,87.5,12.5,5100,"12"));
            pokemons.add(new Pokemon("Blastoise","water","https://assets.pokemon.com/assets/cms2/img/pokedex/full/009.png","The jets of water it spouts from the rocket cannons on its shell can punch through thick steel.",79,83,100,78,85,105,1.6,0,"Rain-dish,Torrent",85.5,87.5,12.5,5100,"12"));
            pokemons.add(new Pokemon("Bulbasaur","Grass","https://assets.pokemon.com/assets/cms2/img/pokedex/full/001.png","For some time after its birth, it grows by gaining nourishment from the seed on its back.",45,49,49,45,65,65,0.7,0,"Chlorophyll, Overgrow",6.9,87.5,12.5,5100,"Ivysaur"));
            pokemons.add(new Pokemon("Ivysaur","Grass","https://assets.pokemon.com/assets/cms2/img/pokedex/full/002.png","When the bud on its back starts swelling, a sweet aroma wafts to indicate the flowers coming bloom.",60,62,63,60,80,80,1,0,"Chlorophyll, Overgrow",13,87.5,12.5,5100,"Venusaur"));
            pokemons.add(new Pokemon("Venusaur","Grass","https://assets.pokemon.com/assets/cms2/img/pokedex/full/003.png","After a rainy day, the flower on its back smells stronger. The scent attracts other Pokémon.",80,82,83,80,100,100,2,0,"Chlorophyll, Overgrow",100,87.5,12.5,5100,"Venusaur"));
            pokemons.add(new Pokemon("Charmander","Fire","https://assets.pokemon.com/assets/cms2/img/pokedex/full/004.png","The fire on the tip of its tail is a measure of its life. If healthy, its tail burns intensely.",39,52,43,65,60,50,0.6,0,"Blaze, Solar-power",8.5,87.5,12.5,5100,"Charmeleon"));
            pokemons.add(new Pokemon("Charmeleon","Fire","https://assets.pokemon.com/assets/cms2/img/pokedex/full/005.png","In the rocky mountains where Charmeleon live, their fiery tails shine at night like stars.",58,64,58,80,80,65,1.1,0,"Blaze, Solar-power",19,87.5,12,5100,"1"));
            pokemons.add(new Pokemon("Charizard","Fire","https://assets.pokemon.com/assets/cms2/img/pokedex/full/006.png","It is said that Charizards fire burns hotter if it has experienced harsh battles.",78,84,78,100,109,85,1.7,0,"Blaze, Solar-power",90.5,87.5,12.5,5100,"1"));
            pokemons.add(new Pokemon("Squirtle","Water","https://assets.pokemon.com/assets/cms2/img/pokedex/full/007.png","It shelters itself in its shell then strikes back with spouts of water at every opportunity.",44,48,65,43,50,64,0.5,0,"Rain-dish, Torrent",9,87.5,12.5,5100,"1"));
            pokemons.add(new Pokemon("Wartortle","water","https://assets.pokemon.com/assets/cms2/img/pokedex/full/008.png","It is said to live 10,000 years. Its furry tail is popular as a symbol of longevity.",59,63,80,58,65,80,1,0,"Rain-dish, Torrent",22.5,87.5,12.5,5100,"12"));
            pokemons.add(new Pokemon("Blastoise","water","https://assets.pokemon.com/assets/cms2/img/pokedex/full/009.png","The jets of water it spouts from the rocket cannons on its shell can punch through thick steel.",79,83,100,78,85,105,1.6,0,"Rain-dish,Torrent",85.5,87.5,12.5,5100,"12"));
            pokemons.add(new Pokemon("Bulbasaur","Grass","https://assets.pokemon.com/assets/cms2/img/pokedex/full/001.png","For some time after its birth, it grows by gaining nourishment from the seed on its back.",45,49,49,45,65,65,0.7,0,"Chlorophyll, Overgrow",6.9,87.5,12.5,5100,"Ivysaur"));
            pokemons.add(new Pokemon("Ivysaur","Grass","https://assets.pokemon.com/assets/cms2/img/pokedex/full/002.png","When the bud on its back starts swelling, a sweet aroma wafts to indicate the flowers coming bloom.",60,62,63,60,80,80,1,0,"Chlorophyll, Overgrow",13,87.5,12.5,5100,"Venusaur"));
            pokemons.add(new Pokemon("Venusaur","Grass","https://assets.pokemon.com/assets/cms2/img/pokedex/full/003.png","After a rainy day, the flower on its back smells stronger. The scent attracts other Pokémon.",80,82,83,80,100,100,2,0,"Chlorophyll, Overgrow",100,87.5,12.5,5100,"Venusaur"));
            pokemons.add(new Pokemon("Charmander","Fire","https://assets.pokemon.com/assets/cms2/img/pokedex/full/004.png","The fire on the tip of its tail is a measure of its life. If healthy, its tail burns intensely.",39,52,43,65,60,50,0.6,0,"Blaze, Solar-power",8.5,87.5,12.5,5100,"Charmeleon"));
            pokemons.add(new Pokemon("Charmeleon","Fire","https://assets.pokemon.com/assets/cms2/img/pokedex/full/005.png","In the rocky mountains where Charmeleon live, their fiery tails shine at night like stars.",58,64,58,80,80,65,1.1,0,"Blaze, Solar-power",19,87.5,12,5100,"1"));
            pokemons.add(new Pokemon("Charizard","Fire","https://assets.pokemon.com/assets/cms2/img/pokedex/full/006.png","It is said that Charizards fire burns hotter if it has experienced harsh battles.",78,84,78,100,109,85,1.7,0,"Blaze, Solar-power",90.5,87.5,12.5,5100,"1"));
            pokemons.add(new Pokemon("Squirtle","Water","https://assets.pokemon.com/assets/cms2/img/pokedex/full/007.png","It shelters itself in its shell then strikes back with spouts of water at every opportunity.",44,48,65,43,50,64,0.5,0,"Rain-dish, Torrent",9,87.5,12.5,5100,"1"));
            pokemons.add(new Pokemon("Wartortle","water","https://assets.pokemon.com/assets/cms2/img/pokedex/full/008.png","It is said to live 10,000 years. Its furry tail is popular as a symbol of longevity.",59,63,80,58,65,80,1,0,"Rain-dish, Torrent",22.5,87.5,12.5,5100,"12"));
            pokemons.add(new Pokemon("Blastoise","water","https://assets.pokemon.com/assets/cms2/img/pokedex/full/009.png","The jets of water it spouts from the rocket cannons on its shell can punch through thick steel.",79,83,100,78,85,105,1.6,0,"Rain-dish,Torrent",85.5,87.5,12.5,5100,"12"));
            return pokemons;

        }

        public static List<Item> getItem(){
          List<Item> items = new ArrayList<>();
          items.add(new Item("Beast Ball","https://img.rankedboost.com/wp-content/uploads/2016/12/beastball.png","A special Poké Ball designed to catch Ultra Beasts. It has a low success rate for catching others."));
          items.add(new Item("Poké Ball","https://img.rankedboost.com/wp-content/uploads/2016/12/Pok%C3%A9_Ball.png","A device for catching wild Pokémon. It’s thrown like a ball at a Pokémon, comfortably encapsulating its target."));
          items.add(new Item("Great Ball","https://img.rankedboost.com/wp-content/uploads/2016/12/Great_Ball.png","A good, high-performance Poké Ball that provides a higher success rate for catching Pokémon than a standard Poké Ball."));
          items.add(new Item("Master Ball","https://img.rankedboost.com/wp-content/uploads/2016/12/Master_Ball.png","The best Poké Ball with the ultimate level of performance. With it, you will catch any wild Pokémon without fail."));
          items.add(new Item("Beast Ball","https://img.rankedboost.com/wp-content/uploads/2016/12/beastball.png","A special Poké Ball designed to catch Ultra Beasts. It has a low success rate for catching others."));
          items.add(new Item("Poké Ball","https://img.rankedboost.com/wp-content/uploads/2016/12/Pok%C3%A9_Ball.png","A device for catching wild Pokémon. It’s thrown like a ball at a Pokémon, comfortably encapsulating its target."));
          items.add(new Item("Great Ball","https://img.rankedboost.com/wp-content/uploads/2016/12/Great_Ball.png","A good, high-performance Poké Ball that provides a higher success rate for catching Pokémon than a standard Poké Ball."));
          items.add(new Item("Master Ball","https://img.rankedboost.com/wp-content/uploads/2016/12/Master_Ball.png","The best Poké Ball with the ultimate level of performance. With it, you will catch any wild Pokémon without fail."));
          items.add(new Item("Beast Ball","https://img.rankedboost.com/wp-content/uploads/2016/12/beastball.png","A special Poké Ball designed to catch Ultra Beasts. It has a low success rate for catching others."));
          items.add(new Item("Poké Ball","https://img.rankedboost.com/wp-content/uploads/2016/12/Pok%C3%A9_Ball.png","A device for catching wild Pokémon. It’s thrown like a ball at a Pokémon, comfortably encapsulating its target."));
          items.add(new Item("Great Ball","https://img.rankedboost.com/wp-content/uploads/2016/12/Great_Ball.png","A good, high-performance Poké Ball that provides a higher success rate for catching Pokémon than a standard Poké Ball."));
          items.add(new Item("Master Ball","https://img.rankedboost.com/wp-content/uploads/2016/12/Master_Ball.png","The best Poké Ball with the ultimate level of performance. With it, you will catch any wild Pokémon without fail."));
          items.add(new Item("Beast Ball","https://img.rankedboost.com/wp-content/uploads/2016/12/beastball.png","A special Poké Ball designed to catch Ultra Beasts. It has a low success rate for catching others."));
          items.add(new Item("Poké Ball","https://img.rankedboost.com/wp-content/uploads/2016/12/Pok%C3%A9_Ball.png","A device for catching wild Pokémon. It’s thrown like a ball at a Pokémon, comfortably encapsulating its target."));
          items.add(new Item("Great Ball","https://img.rankedboost.com/wp-content/uploads/2016/12/Great_Ball.png","A good, high-performance Poké Ball that provides a higher success rate for catching Pokémon than a standard Poké Ball."));
          items.add(new Item("Master Ball","https://img.rankedboost.com/wp-content/uploads/2016/12/Master_Ball.png","The best Poké Ball with the ultimate level of performance. With it, you will catch any wild Pokémon without fail."));



          return items;
        }

}
