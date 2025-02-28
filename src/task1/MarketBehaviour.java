package task1;

import java.util.List;

interface MarketBehaviour {

    void acceptToMarket(Actor actor);

    void releaseFromMarket(List<Actor> actors);

    void update();
}
