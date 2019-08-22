/*
 * Copyright (C) 2019 Ruslan López Carro
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package inventarios.desktop.navigation;

import inventarios.desktop.EmployeeRegistration;
import javax.swing.JFrame;
import org.springframework.stereotype.Component;

/**
 *
 * @author Ruslan López Carro <scherzo16 at gmail.com>
 */
@Component
public class ListaEmpleadosVisitor extends NavigationHandler{

    @Override
    public void goToEmployeeRegistration(JFrame origin) {
        EmployeeRegistration employeeRegistration = context.getBean(EmployeeRegistration.class);
        employeeRegistration.setVisible(true);
        origin.dispose();
    }
    
}
