/*FreeMind - A Program for creating and viewing Mindmaps
 *Copyright (C) 2000-2001  Joerg Mueller <joergmueller@bigfoot.com>
 *See COPYING for Details
 *
 *This program is free software; you can redistribute it and/or
 *modify it under the terms of the GNU General Public License
 *as published by the Free Software Foundation; either version 2
 *of the License, or (at your option) any later version.
 *
 *This program is distributed in the hope that it will be useful,
 *but WITHOUT ANY WARRANTY; without even the implied warranty of
 *MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *GNU General Public License for more details.
 *
 *You should have received a copy of the GNU General Public License
 *along with this program; if not, write to the Free Software
 *Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
/*$Id: Mode.java,v 1.8.12.2 2004-05-23 12:39:02 christianfoltin Exp $*/

package freemind.modes;

import javax.swing.JToolBar;

import freemind.controller.Controller;

public interface Mode {

    public void init(Controller c);
    public String toString();
    public void activate();
    public void restore(String restorable);
    public ModeController getModeController();
    public Controller getController();
    public JToolBar getModeToolBar();
    /** For the toolbar on the left hand side of the window.*/
    public JToolBar getLeftToolBar();
}
