package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("needleBean")
public class Needle7 {
    private Death8 death;

    @Override
    public String toString() {
        return ", смерть Кощея на игле :(" + death.toString();
    }

    @Autowired
    @Qualifier("getDeath")
    public void setDeath(Death8 death) {
        this.death = death;
    }
}
