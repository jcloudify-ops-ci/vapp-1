package com.vapp.api.file.hash;

import com.vapp.api.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
