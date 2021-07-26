package might.vm.wasm.instruction.control;

import might.vm.wasm.error.execute.ExecutionException;
import might.vm.wasm.instruction.Operate;
import might.vm.wasm.model.Dump;
import might.vm.wasm.core.structure.ModuleInstance;
import might.vm.wasm.core.WasmReader;

public class Unreachable implements Operate {

    @Override
    public Dump read(WasmReader reader) {
        return null;
    }

    @Override
    public void operate(ModuleInstance mi, Dump args) {
        throw new ExecutionException("unreachable code ?");
    }

}
