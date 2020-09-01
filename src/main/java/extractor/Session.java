package extractor;

import soot.Unit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Session {
    private Map<String, Integer> _map = new HashMap<>();

    public int nextNumber(String s) {
        Integer x = _map.get(s);

        if (x == null) {
            x = 0;
        }

        _map.put(s, x + 1);

        return x;
    }

    private Map<Unit, Integer> _units = new HashMap<>();

    public void numberUnits(Iterator<Unit> iterator) {
        int index = 0;

        while (iterator.hasNext()) {
            _units.put(iterator.next(), index);
            index++;
        }
    }

    public int getUnitNumber(Unit u) {
        return _units.get(u);
    }

    private Unit _currentUnit;

    public void setCurrentUnit(Unit u) {
        _currentUnit = u;
    }

    public Unit getCurrentUnit() {
        return _currentUnit;
    }
}
