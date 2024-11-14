package org.acme;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.jboss.resteasy.reactive.RestPath;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/labseq")
@Tag(name = "Calculations Resource", description = "Provides methods for LabSeq computations")
public class LabSeqController {

    @Inject
    LabSeqService labSeqService;

    @GET
    @Path("/{n}")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Calculate LabSeq", description = "Recursive calculation of LabSeq, for the given path parameter {n}")
    public LabSeqResponse labseq(@RestPath int n) {
        long start, finish;
        int result;

        start = System.nanoTime();
        result = labSeqService.calculateLabSeq(n);
        finish = System.nanoTime() - start;

        return new LabSeqResponse(n, result, finish);
    }
}
