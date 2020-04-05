/*******************************************************************************
 * Copyhacked (H) 2012-2020.
 * This program and the accompanying materials
 * are made available under no term at all, use it like
 * you want, but share and discuss about it
 * every time possible with every body.
 * 
 * Contributors:
 *      ron190 at ymail dot com - initial implementation
 ******************************************************************************/
package com.jsql.view.swing.interaction;

import com.jsql.model.injection.strategy.AbstractStrategy;
import com.jsql.view.interaction.InteractionCommand;
import com.jsql.view.swing.MediatorGui;

/**
 * Mark the injection as invulnerable to a time based injection.
 */
public class MarkTimeStrategy implements InteractionCommand {
    
    /**
     * @param interactionParams
     */
    public MarkTimeStrategy(Object[] interactionParams) {
        // Do nothing
    }

    @Override
    public void execute() {
        
        AbstractStrategy strategy = MediatorGui.model().getMediatorStrategy().getTime();
        
        MediatorGui.panelAddressBar().getAddressMenuBar().markStrategy(strategy);
    }
}
