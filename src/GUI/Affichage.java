/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entities.Regime;
import Services.RegimeService;
import com.codename1.components.SpanLabel;
import com.codename1.ui.Form;

import java.util.ArrayList;

/**
 *
 * @author sana
 */
public class Affichage {

    Form f;
    SpanLabel lb;
  
    public Affichage() {
        
        f = new Form();
        lb = new SpanLabel("");
        f.add(lb);
        RegimeService serviceTask=new RegimeService();
        ArrayList<Regime> lis=serviceTask.getList2();
        lb.setText(lis.toString());
          f.getToolbar().addCommandToRightBar("back", null, (ev)->{HomeForm h=new HomeForm();
          h.getF().show();
          });
    }

    public Form getF() {
        return f;
    }

    public void setF(Form f) {
        this.f = f;
    }

}
