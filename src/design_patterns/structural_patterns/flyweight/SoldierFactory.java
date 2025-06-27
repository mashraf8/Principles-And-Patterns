package design_patterns.structural_patterns.flyweight;
import java.util.HashMap;
import java.util.Map;

public class SoldierFactory
{
    private static Map<String, SoldierType> soldiers = new HashMap<>();

    public static SoldierType getSoldier(String type, String weapon, String color)
    {
        String key = type + "-" + weapon + "-" + color;
        if (!soldiers.containsKey(key))
        {
            soldiers.put(key, new SoldierType(type, weapon, color));
        }
        return soldiers.get(key);

    }
}
