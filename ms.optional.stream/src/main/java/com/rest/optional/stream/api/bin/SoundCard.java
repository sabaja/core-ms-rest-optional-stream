package com.rest.optional.stream.api.bin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public final class SoundCard implements Serializable {
    private static final long serialVersionUID = 636023621315123543L;
    private String version;
    private USB usb;
}
