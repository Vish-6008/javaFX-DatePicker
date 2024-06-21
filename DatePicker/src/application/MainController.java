/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose: Below code set's and get the value's with action for Button's.
 *   Project:  MainController[Date-Picker]
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437 
 *********************************************************************************************/



package application;

import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class MainController {
	@FXML private DatePicker dp;
	@FXML private Label showdatelbl;
	
	public void ShowDate(ActionEvent event) {
		LocalDate ld=dp.getValue();
		showdatelbl.setText(ld.toString());
	}

}
