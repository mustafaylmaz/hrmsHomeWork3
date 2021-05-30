package homework.hrms.core.utilities.registerRule;

import homework.hrms.core.utilities.results.Result;
import lombok.var;

public class registerRule {
    public static boolean run(Result... results) {
        for (var result: results) {
            if(!result.isSuccess()) {
                return false;

            }
        }
        return true;

    }

}
