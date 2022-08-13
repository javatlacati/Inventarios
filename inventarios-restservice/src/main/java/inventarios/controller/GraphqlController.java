package inventarios.controller;

import graphql.ExecutionInput;
import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.SchemaPrinter;
import inventarios.service.ProviderService;
import io.leangen.graphql.GraphQLSchemaGenerator;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class GraphqlController {
//    private final GraphQL graphQL;
    public GraphqlController(ProviderService providerService) {
//        GraphQLSchema schema = new GraphQLSchemaGenerator()
//                .withBasePackages("io.leangen.spqr.samples.demo")
//                .withOperationsFromSingletons(providerService)
//                .generate();
//        new SchemaPrinter(
//                // Tweak the options accordingly
//                SchemaPrinter.Options.defaultOptions()
//                        .includeScalarTypes(true)
////                        .includeExtendedScalarTypes(true)
//                        .includeIntrospectionTypes(true)
////                        .includeSchemaDefintion(true)
//        ).print(schema);
//        graphQL = GraphQL.newGraphQL(schema).build();
    }

//    @PostMapping(value = "/graphql", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseBody
//    public Map<String, Object> indexFromAnnotated(@RequestBody Map<String, String> request, HttpServletRequest raw) {
//        ExecutionResult executionResult = graphQL.execute(ExecutionInput.newExecutionInput()
//                .query(request.get("query"))
//                .operationName(request.get("operationName"))
//                .context(raw)
//                .build());
//        return executionResult.toSpecification();
//    }
}
