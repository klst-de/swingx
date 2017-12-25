/*
 * $Id: SelectionListener.java 2977 2008-07-07 03:17:53Z kschaefe $
 *
 * Copyright 2004 Sun Microsystems, Inc., 4150 Network Circle,
 * Santa Clara, California 95054, U.S.A. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package org.jdesktop.swingx.event;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.TreeSelectionEvent;

/**
 * Listener for receiving global selection change notifications.
 * @author Amy Fowler
 * @version 1.0
 */
public interface SelectionListener {

    void valueChanged(ListSelectionEvent e);
    void valueChanged(TreeSelectionEvent e);

}
