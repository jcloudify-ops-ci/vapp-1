package com.vapp.api.endpoint.event.consumer.model;

import com.vapp.api.PojaGenerated;
import com.vapp.api.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
