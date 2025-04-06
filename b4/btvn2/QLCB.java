package b4.btvn2;

import java.util.ArrayList;
import java.util.List;

public class QLCB {
    private List<CanBo> canBos = new ArrayList<>();

    public QLCB() {
    }

    public void add(CanBo canBo) {
        canBos.add(canBo);
    }

    public List<CanBo> getCanBos(String name) {
        List<CanBo> result = new ArrayList<CanBo>();
        for(CanBo canBo : canBos) {
            if(canBo.getTen().equals(name)) {
                result.add(canBo);
            }
        }
        return result;
    }

    public void display() {
        for(CanBo canBo : canBos) {
            System.out.println(canBo);
        }
    }

}
