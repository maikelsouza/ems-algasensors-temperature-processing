package com.algaworks.algasensors.temperature.processing;

import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.TimeBasedEpochRandomGenerator;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class UUIDv7Test {


    @Test
    void shouldGenerateUUIDv7(){

        TimeBasedEpochRandomGenerator timeBasedEpochRandomGenerator = Generators.timeBasedEpochRandomGenerator();
        UUID uuid = timeBasedEpochRandomGenerator.generate();
        UUID uuid2 = timeBasedEpochRandomGenerator.generate();
        UUID uuid3 = timeBasedEpochRandomGenerator.generate();
        UUID uuid4 = timeBasedEpochRandomGenerator.generate();

        System.out.println(uuid);
        System.out.println(uuid.timestamp());
        System.out.println(uuid2);
        System.out.println(uuid3);
        System.out.println(uuid4);



    }
}
