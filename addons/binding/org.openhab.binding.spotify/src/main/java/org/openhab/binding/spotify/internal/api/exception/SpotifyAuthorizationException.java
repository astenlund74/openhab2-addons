/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.spotify.internal.api.exception;

/**
 * Spotify authorization problems exception class.
 *
 * @author Hilbrand Bouwkamp - Initial contribution
 */
public class SpotifyAuthorizationException extends RuntimeException {

    private static final long serialVersionUID = -1931713564920750911L;

    /**
     * Constructor.
     *
     * @param message Spotify error message
     */
    public SpotifyAuthorizationException(String message) {
        super(message);
    }

    /**
     * Constructor.
     *
     * @param message Spotify error message
     * @param exception Original cause of this exception
     */
    public SpotifyAuthorizationException(String message, Throwable exception) {
        super(message, exception);
    }

}
